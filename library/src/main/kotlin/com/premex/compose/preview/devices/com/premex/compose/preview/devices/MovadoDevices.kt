package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Movado device specifications for Android Compose previews.
 *
 * This extension provides Movado device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movado.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movado: Any
  get() = object {
      /** DeviceSpec(manufacturer=Movado, code=tilefish, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Movado, code=tilefish, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val TILEFISH = "spec:width=390,height=390,unit=px,dpi=320"

  }
