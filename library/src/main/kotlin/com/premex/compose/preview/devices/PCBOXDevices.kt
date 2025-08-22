package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PCBOX device specifications for Android Compose previews.
 *
 * This extension provides PCBOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PCBOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PCBOX: Any
  get() = object {
      /** PCBOX Kova_PCB-T730 */
      val KOVA_PCB_T730 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PCBOX mid1008 */
      val MID1008 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PCBOX mid1032_mk */
      val MID1032_MK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PCBOX MID7015A-MK */
      val MID7015A_MK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PCBOX PCB-T105 */
      val PCB_T105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PCBOX PCB-T106 */
      val PCB_T106 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PCBOX PCB_T801 */
      val PCB_T801 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
