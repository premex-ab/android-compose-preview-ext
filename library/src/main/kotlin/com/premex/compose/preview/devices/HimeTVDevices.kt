package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HimeTV device specifications for Android Compose previews.
 *
 * This extension provides HimeTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HimeTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HimeTV: Any
  get() = object {
      /** HimeTV HIME_B866V2FAS */
      val HIME_B866V2FAS = "spec:width=720,height=1280,unit=px,dpi=213"

  }
