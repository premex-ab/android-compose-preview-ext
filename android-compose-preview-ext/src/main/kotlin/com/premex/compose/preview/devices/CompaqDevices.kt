package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COMPAQ device specifications for Android Compose previews.
 *
 * This extension provides COMPAQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Compaq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Compaq: Any
  get() = object {
      /** COMPAQ CT201 */
      val CT201 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** COMPAQ CT211 */
      val CT211 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** COMPAQ guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** COMPAQ marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** COMPAQ martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** COMPAQ nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** COMPAQ Q5 */
      val Q5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** COMPAQ QTAB10_1 */
      val QTAB10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COMPAQ QTAB10_PLUS */
      val QTAB10_PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** COMPAQ QTAB8 */
      val QTAB8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COMPAQ QTabPro */
      val QTABPRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** COMPAQ R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** COMPAQ R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** COMPAQ stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** COMPAQ zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
