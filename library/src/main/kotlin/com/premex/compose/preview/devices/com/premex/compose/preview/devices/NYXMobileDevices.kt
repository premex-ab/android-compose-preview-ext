package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NYX_Mobile device specifications for Android Compose previews.
 *
 * This extension provides NYX_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NYXMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NYXMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=NYX_Mobile, code=Click, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NYX_Mobile, code=Click, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val CLICK = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NYX_Mobile, code=GLAM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NYX_Mobile, code=GLAM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GLAM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NYX_Mobile, code=KiN, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NYX_Mobile, code=KiN, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KIN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NYX_Mobile, code=NYX_SHADE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NYX_Mobile, code=NYX_SHADE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val NYX_SHADE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NYX_Mobile, code=Rex, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NYX_Mobile, code=Rex, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val REX = "spec:width=480,height=854,unit=px,dpi=240"

  }
