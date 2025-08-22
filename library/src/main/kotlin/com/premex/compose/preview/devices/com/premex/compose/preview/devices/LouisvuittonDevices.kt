package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * louisvuitton device specifications for Android Compose previews.
 *
 * This extension provides louisvuitton device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Louisvuitton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Louisvuitton: Any
  get() = object {
      /** DeviceSpec(manufacturer=louisvuitton, code=ling, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=louisvuitton, code=ling, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val LING = "spec:width=390,height=390,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=louisvuitton, code=sundial, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=louisvuitton, code=sundial,
      width=390, height=390, dpi=320, isGoogleDevice=false).code */
      val SUNDIAL = "spec:width=390,height=390,unit=px,dpi=320"

  }
