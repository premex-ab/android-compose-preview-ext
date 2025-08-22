package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * tagheuer device specifications for Android Compose previews.
 *
 * This extension provides tagheuer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tagheuer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tagheuer: Any
  get() = object {
      /** DeviceSpec(manufacturer=tagheuer, code=anthracite, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tagheuer, code=anthracite,
      width=400, height=400, dpi=280, isGoogleDevice=false).code */
      val ANTHRACITE = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=tagheuer, code=glacier, width=360, height=360, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tagheuer, code=glacier, width=360,
      height=360, dpi=240, isGoogleDevice=false).code */
      val GLACIER = "spec:width=360,height=360,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=tagheuer, code=orbital, width=454, height=454, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tagheuer, code=orbital, width=454,
      height=454, dpi=320, isGoogleDevice=false).code */
      val ORBITAL = "spec:width=454,height=454,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=tagheuer, code=oxygen42, width=416, height=416, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tagheuer, code=oxygen42, width=416,
      height=416, dpi=320, isGoogleDevice=false).code */
      val OXYGEN42 = "spec:width=416,height=416,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=tagheuer, code=oxygen45, width=454, height=454, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tagheuer, code=oxygen45, width=454,
      height=454, dpi=320, isGoogleDevice=false).code */
      val OXYGEN45 = "spec:width=454,height=454,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=tagheuer, code=spectralite, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tagheuer, code=spectralite,
      width=390, height=390, dpi=320, isGoogleDevice=false).code */
      val SPECTRALITE = "spec:width=390,height=390,unit=px,dpi=320"

  }
