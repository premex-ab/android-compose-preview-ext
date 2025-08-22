package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Achate device specifications for Android Compose previews.
 *
 * This extension provides Achate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Achate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Achate: Any
  get() = object {
      /** Achate KidsTab1_EEA */
      val KIDSTAB1_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Achate KidsTab3_EEA */
      val KIDSTAB3_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Achate Kids_Tab_2 */
      val KIDS_TAB_2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
