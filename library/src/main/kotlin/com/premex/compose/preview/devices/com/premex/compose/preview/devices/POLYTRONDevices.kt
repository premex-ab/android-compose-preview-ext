package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POLYTRON device specifications for Android Compose previews.
 *
 * This extension provides POLYTRON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POLYTRON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POLYTRON: Any
  get() = object {
      /** DeviceSpec(manufacturer=POLYTRON, code=lakeside, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=lakeside,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=lushan, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=lushan, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=POLYTRON, code=nagai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=nagai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=POLYTRON, code=PDB_F2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=PDB_F2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PDB_F2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=pioneer, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=pioneer, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_A552, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_A552,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POLYTRON_A552 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_P552, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_P552,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val POLYTRON_P552 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_R2509, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_R2509,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POLYTRON_R2509 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_R2509SE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_R2509SE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POLYTRON_R2509SE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_R250A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLYTRON, code=POLYTRON_R250A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val POLYTRON_R250A = "spec:width=720,height=1280,unit=px,dpi=320"

  }
