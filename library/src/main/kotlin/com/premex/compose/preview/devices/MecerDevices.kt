package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MECER device specifications for Android Compose previews.
 *
 * This extension provides MECER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mecer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mecer: Any
  get() = object {
      /** MECER M17QF6-3Gplus */
      val M17QF6_3GPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MECER M77QF6 */
      val M77QF6 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MECER MF716 */
      val MF716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MECER TF10EA2_11 */
      val TF10EA2_11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MECER TF10MK1_3 */
      val TF10MK1_3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
