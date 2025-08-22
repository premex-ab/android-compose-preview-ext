package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOBODO device specifications for Android Compose previews.
 *
 * This extension provides MOBODO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOBODO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOBODO: Any
  get() = object {
      /** DeviceSpec(manufacturer=MOBODO, code=MOBOK2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBODO, code=MOBOK2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val MOBOK2 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
