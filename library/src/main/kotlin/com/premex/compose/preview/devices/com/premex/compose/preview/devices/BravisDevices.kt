package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bravis device specifications for Android Compose previews.
 *
 * This extension provides bravis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bravis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bravis: Any
  get() = object {
      /** DeviceSpec(manufacturer=bravis, code=bravis_A506, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=bravis_A506,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BRAVIS_A506 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=bravis, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=bravis, code=NB108, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=NB108, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NB108 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bravis, code=NB753, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=NB753, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NB753 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bravis, code=NB76, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=NB76, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NB76 = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bravis, code=NB851, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=NB851, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NB851 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bravis, code=NB871, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=NB871, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NB871 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=bravis, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bravis, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
