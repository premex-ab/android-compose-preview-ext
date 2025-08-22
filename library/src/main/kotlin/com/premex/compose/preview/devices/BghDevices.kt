package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BGH device specifications for Android Compose previews.
 *
 * This extension provides BGH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bgh.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bgh: Any
  get() = object {
      /** BGH BGH_Joy_303 */
      val BGH_JOY_303 = "spec:width=480,height=854,unit=px,dpi=240"

      /** BGH hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BGH kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BGH lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BGH N918St */
      val N918ST = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BGH P635A20 */
      val P635A20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BGH sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BGH xiaoyushan */
      val XIAOYUSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BGH ZTE_Blade_A475 */
      val ZTE_BLADE_A475 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** BGH ZTE_Blade_V580 */
      val ZTE_BLADE_V580 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
