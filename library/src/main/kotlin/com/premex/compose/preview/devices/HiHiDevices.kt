package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HiHi device specifications for Android Compose previews.
 *
 * This extension provides HiHi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HiHi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HiHi: Any
  get() = object {
      /** HiHi HIHI-40KH-TAB */
      val HIHI_40KH_TAB = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** HiHi HIHI-41KH-TAB-1-EEA */
      val HIHI_41KH_TAB_1_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
