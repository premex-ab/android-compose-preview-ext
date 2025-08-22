package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ghia device specifications for Android Compose previews.
 *
 * This extension provides ghia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ghia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ghia: Any
  get() = object {
      /** DeviceSpec(manufacturer=ghia, code=GA8N2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ghia, code=GA8N2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GA8N2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ghia, code=GK133M24, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ghia, code=GK133M24, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133M24 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ghia, code=GK133P24, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ghia, code=GK133P24, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK133P24 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ghia, code=GK523A24, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ghia, code=GK523A24, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GK523A24 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ghia, code=GPND133V4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ghia, code=GPND133V4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GPND133V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ghia, code=GVLTE13, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ghia, code=GVLTE13, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GVLTE13 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
