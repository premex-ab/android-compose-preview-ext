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
      /** DeviceSpec(manufacturer=MITO, code=A21, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=A21, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A21 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MITO, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A16, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A16, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MITO_A16 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A17, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A17, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MITO_A17 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A19_1GB, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A19_1GB, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MITO_A19_1GB = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A19_2GB, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A19_2GB, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MITO_A19_2GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MITO, code=Mito_A35, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=Mito_A35, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MITO_A35 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A36_W1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A36_W1, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MITO_A36_W1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A37_Z1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A37_Z1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MITO_A37_Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MITO, code=MITO_A37_Z1plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_A37_Z1plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MITO_A37_Z1PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MITO, code=MITO_T7, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=MITO_T7, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MITO_T7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MITO, code=T8, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=T8, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T8 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MITO, code=T85, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MITO, code=T85, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val T85 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
