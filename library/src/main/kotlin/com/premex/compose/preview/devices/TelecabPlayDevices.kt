package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TelecabPlay device specifications for Android Compose previews.
 *
 * This extension provides TelecabPlay device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TelecabPlay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TelecabPlay: Any
  get() = object {
      /** TelecabPlay B866V2FA_TELECAB */
      val B866V2FA_TELECAB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
