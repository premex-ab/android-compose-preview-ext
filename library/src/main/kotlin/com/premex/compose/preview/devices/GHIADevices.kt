package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GHIA device specifications for Android Compose previews.
 *
 * This extension provides GHIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GHIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GHIA: Any
  get() = object {
      /** GHIA A7_3G */
      val A7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA A7_WF */
      val A7_WF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GA7133 */
      val GA7133 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GA8N */
      val GA8N = "spec:width=1080,height=1440,unit=px,dpi=213"

      /** GHIA GHIA_A1 */
      val GHIA_A1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** GHIA GHIA_A7 */
      val GHIA_A7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GHIA_AXIS7 */
      val GHIA_AXIS7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GHIA_AXIS7P */
      val GHIA_AXIS7P = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GHIA_L1 */
      val GHIA_L1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** GHIA GHIA_VECTOR_3G */
      val GHIA_VECTOR_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GHIA GK133 */
      val GK133 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GK133M3 */
      val GK133M3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GK133N3 */
      val GK133N3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GK133S3 */
      val GK133S3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GK133T3 */
      val GK133T3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GK133V3 */
      val GK133V3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GPND133 */
      val GPND133 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GRINV1 */
      val GRINV1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** GHIA GS3G */
      val GS3G = "spec:width=480,height=854,unit=px,dpi=240"

      /** GHIA GTA7PLUS */
      val GTA7PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTA7WF */
      val GTA7WF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTAB718 */
      val GTAB718 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTABKIDS */
      val GTABKIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTABPND */
      val GTABPND = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTKIDS7A */
      val GTKIDS7A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTKIDS7B */
      val GTKIDS7B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTKIDS7R */
      val GTKIDS7R = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTKIDS7V */
      val GTKIDS7V = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTKIDS7-100 */
      val GTKIDS7_100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTPND7 */
      val GTPND7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTTODD7 */
      val GTTODD7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA GTVR10S */
      val GTVR10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GHIA GVPNT */
      val GVPNT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GHIA N2 */
      val N2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GHIA stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** GHIA TREO_TAB8G */
      val TREO_TAB8G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA VECTOR10_1 */
      val VECTOR10_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GHIA Vector_3G */
      val VECTOR_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GHIA VECTOR_SLIM */
      val VECTOR_SLIM = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GHIA zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
