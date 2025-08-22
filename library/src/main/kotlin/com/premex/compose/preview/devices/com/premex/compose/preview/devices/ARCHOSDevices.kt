package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARCHOS device specifications for Android Compose previews.
 *
 * This extension provides ARCHOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARCHOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARCHOS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARCHOS, code=AC101XPro4G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=AC101XPro4G,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val AC101XPRO4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARCHOS, code=act101fhd2wf, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=act101fhd2wf,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ACT101FHD2WF = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ARCHOS, code=ACT101FHD4G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=ACT101FHD4G,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val ACT101FHD4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARCHOS, code=ACT101WF, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=ACT101WF, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ACT101WF = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ARCHOS, code=ACT110FHD4GULTRA, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=ACT110FHD4GULTRA,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val ACT110FHD4GULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ARCHOS, code=act80hdwf, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=act80hdwf, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ACT80HDWF = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ARCHOS, code=ARCHOS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=ARCHOS, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ARCHOS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ARCHOS, code=ARCHOST96, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=ARCHOST96, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val ARCHOST96 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=ARCHOS, code=ARCHOST963G, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=ARCHOST963G,
      width=800, height=1280, dpi=210, isGoogleDevice=false).code */
      val ARCHOST963G = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=ARCHOS, code=X18_Ultra, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCHOS, code=X18_Ultra, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val X18_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
