package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ODS device specifications for Android Compose previews.
 *
 * This extension provides ODS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ODS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ODS: Any
  get() = object {
      /** ODS TA2C-DR9 */
      val TA2C_DR9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODS TA2C-DR94G */
      val TA2C_DR94G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODS TA2C-NF8 */
      val TA2C_NF8 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
