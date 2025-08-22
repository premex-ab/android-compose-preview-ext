package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART_TEK device specifications for Android Compose previews.
 *
 * This extension provides SMART_TEK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartTek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartTek: Any
  get() = object {
      /** SMART_TEK MR_POTATO_HEAD */
      val MR_POTATO_HEAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SMART_TEK PLAY_DOH */
      val PLAY_DOH = "spec:width=600,height=1024,unit=px,dpi=160"

  }
