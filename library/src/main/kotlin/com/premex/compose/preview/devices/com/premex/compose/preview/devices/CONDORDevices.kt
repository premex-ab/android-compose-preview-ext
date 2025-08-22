package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONDOR device specifications for Android Compose previews.
 *
 * This extension provides CONDOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONDOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONDOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=CONDOR, code=phs601, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONDOR, code=phs601, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PHS601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CONDOR, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONDOR, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CONDOR, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONDOR, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CONDOR, code=tcl_eu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONDOR, code=tcl_eu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
