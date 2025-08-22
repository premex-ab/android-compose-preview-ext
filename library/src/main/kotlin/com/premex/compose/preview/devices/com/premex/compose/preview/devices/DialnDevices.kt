package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dialn device specifications for Android Compose previews.
 *
 * This extension provides Dialn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dialn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dialn: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dialn, code=Neo, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=Neo, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=NeoA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=NeoA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NEOA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=Nova, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=Nova, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOVA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=NovaA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=NovaA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOVAA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X62, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X62, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X62 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X62A, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X62A, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X62A = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X62B, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X62B, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X62B = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X62C, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X62C, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X62C = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X65A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X65A, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X65A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X65B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X65B, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X65B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X65C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X65C, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X65C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dialn, code=X68B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dialn, code=X68B, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X68B = "spec:width=720,height=1600,unit=px,dpi=320"

  }
