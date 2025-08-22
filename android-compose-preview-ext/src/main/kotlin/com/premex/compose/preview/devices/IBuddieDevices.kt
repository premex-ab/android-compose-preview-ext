package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * i-Buddie device specifications for Android Compose previews.
 *
 * This extension provides i-Buddie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IBuddie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IBuddie: Any
  get() = object {
      /** i-Buddie RealPad_MA7BX2_1 */
      val REALPAD_MA7BX2_1 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** i-Buddie TF10EA2_P8_1 */
      val TF10EA2_P8_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** i-Buddie TG08RK */
      val TG08RK = "spec:width=800,height=1280,unit=px,dpi=240"

      /** i-Buddie TG08RK1 */
      val TG08RK1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** i-Buddie TP10RA1_1 */
      val TP10RA1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** i-Buddie TR10CS1_12 */
      val TR10CS1_12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** i-Buddie TU10MK1_1 */
      val TU10MK1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** i-Buddie TU11MK1_1 */
      val TU11MK1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** i-Buddie TU11MK1_2 */
      val TU11MK1_2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
