package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DOMATON device specifications for Android Compose previews.
 *
 * This extension provides DOMATON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DOMATON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DOMATON: Any
  get() = object {
      /** DeviceSpec(manufacturer=DOMATON, code=D102, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOMATON, code=D102, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val D102 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DOMATON, code=D718, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOMATON, code=D718, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val D718 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DOMATON, code=K111, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOMATON, code=K111, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K111 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
