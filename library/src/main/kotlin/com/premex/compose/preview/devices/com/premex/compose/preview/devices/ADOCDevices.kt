package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADOC device specifications for Android Compose previews.
 *
 * This extension provides ADOC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADOC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADOC: Any
  get() = object {
      /** DeviceSpec(manufacturer=ADOC, code=ADOC_D18, width=480, height=854, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADOC, code=ADOC_D18, width=480,
      height=854, dpi=160, isGoogleDevice=false).code */
      val ADOC_D18 = "spec:width=480,height=854,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ADOC, code=D30, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADOC, code=D30, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D30 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
