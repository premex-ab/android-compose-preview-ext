package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MITO device specifications for Android Compose previews.
 *
 * This extension provides MITO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MITO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MITO: Any
  get() = object {
      /** MITO A21 */
      val A21 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MITO mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MITO MITO_A16 */
      val MITO_A16 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MITO MITO_A17 */
      val MITO_A17 = "spec:width=480,height=854,unit=px,dpi=240"

      /** MITO MITO_A19_1GB */
      val MITO_A19_1GB = "spec:width=480,height=854,unit=px,dpi=213"

      /** MITO MITO_A19_2GB */
      val MITO_A19_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MITO Mito_A35 */
      val MITO_A35 = "spec:width=480,height=960,unit=px,dpi=240"

      /** MITO MITO_A36_W1 */
      val MITO_A36_W1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** MITO MITO_A37_Z1 */
      val MITO_A37_Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** MITO MITO_A37_Z1plus */
      val MITO_A37_Z1PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MITO MITO_T7 */
      val MITO_T7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** MITO T8 */
      val T8 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** MITO T85 */
      val T85 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
