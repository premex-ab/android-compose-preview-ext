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
      /** DeviceSpec(manufacturer=GHIA, code=A7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=A7_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val A7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=A7_WF, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=A7_WF, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val A7_WF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GA7133, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GA7133, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GA7133 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GA8N, width=1080, height=1440, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GA8N, width=1080,
      height=1440, dpi=213, isGoogleDevice=false).code */
      val GA8N = "spec:width=1080,height=1440,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GHIA, code=GHIA_A1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GHIA_A1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GHIA_A1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GHIA, code=GHIA_A7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GHIA_A7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GHIA_A7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GHIA_AXIS7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GHIA_AXIS7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GHIA_AXIS7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GHIA_AXIS7P, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GHIA_AXIS7P, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GHIA_AXIS7P = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GHIA_L1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GHIA_L1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GHIA_L1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GHIA, code=GHIA_VECTOR_3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GHIA_VECTOR_3G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val GHIA_VECTOR_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GK133, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GK133, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GK133M3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GK133M3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133M3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GK133N3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GK133N3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133N3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GK133S3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GK133S3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133S3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GK133T3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GK133T3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133T3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GK133V3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GK133V3, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133V3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GPND133, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GPND133, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GPND133 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GRINV1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GRINV1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val GRINV1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GHIA, code=GS3G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GS3G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GS3G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GHIA, code=GTA7PLUS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTA7PLUS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTA7PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTA7WF, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTA7WF, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTA7WF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTAB718, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTAB718, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTAB718 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTABKIDS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTABKIDS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTABKIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTABPND, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTABPND, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTABPND = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTKIDS7A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTKIDS7A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTKIDS7A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTKIDS7B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTKIDS7B, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTKIDS7B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTKIDS7R, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTKIDS7R, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTKIDS7R = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTKIDS7V, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTKIDS7V, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTKIDS7V = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTKIDS7-100, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTKIDS7-100, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTKIDS7_100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTPND7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTPND7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTPND7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTTODD7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTTODD7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTTODD7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GTVR10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GTVR10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GTVR10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=GVPNT, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=GVPNT, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GVPNT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GHIA, code=N2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=N2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GHIA, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GHIA, code=TREO_TAB8G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=TREO_TAB8G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TREO_TAB8G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=VECTOR10_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=VECTOR10_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VECTOR10_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GHIA, code=Vector_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=Vector_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VECTOR_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GHIA, code=VECTOR_SLIM, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=VECTOR_SLIM, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VECTOR_SLIM = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GHIA, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GHIA, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
