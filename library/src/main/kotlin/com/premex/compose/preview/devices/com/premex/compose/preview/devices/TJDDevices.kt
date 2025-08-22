package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TJD device specifications for Android Compose previews.
 *
 * This extension provides TJD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TJD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TJD: Any
  get() = object {
      /** DeviceSpec(manufacturer=TJD, code=MT-1011, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-1011, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val MT_1011 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=TJD, code=MT-1011OF, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-1011OF, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MT_1011OF = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TJD, code=MT-1011QR, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-1011QR, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MT_1011QR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TJD, code=MT_1025QU, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT_1025QU, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val MT_1025QU = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=TJD, code=MT-710QF, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-710QF, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val MT_710QF = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TJD, code=MT-710QU, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-710QU, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MT_710QU = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TJD, code=MT-710QU_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-710QU_Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MT_710QU_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TJD, code=MT-717QW, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-717QW, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MT_717QW = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TJD, code=MT-750QR, width=1080, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-750QR, width=1080,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val MT_750QR = "spec:width=1080,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TJD, code=MT-750QU, width=1080, height=1440, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-750QU, width=1080,
      height=1440, dpi=213, isGoogleDevice=false).code */
      val MT_750QU = "spec:width=1080,height=1440,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TJD, code=MT-761QU_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-761QU_Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MT_761QU_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TJD, code=MT-790QR_V1, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TJD, code=MT-790QR_V1, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val MT_790QR_V1 = "spec:width=1536,height=2048,unit=px,dpi=320"

  }
