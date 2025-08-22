package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIMOQ device specifications for Android Compose previews.
 *
 * This extension provides VIMOQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIMOQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIMOQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIMOQ, code=VIMOQ-A631LO, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIMOQ, code=VIMOQ-A631LO,
      width=480, height=1014, dpi=200, isGoogleDevice=false).code */
      val VIMOQ_A631LO = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=VIMOQ, code=VIMOQ-P662LO, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIMOQ, code=VIMOQ-P662LO,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val VIMOQ_P662LO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIMOQ, code=VIMOQ-S661LS, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIMOQ, code=VIMOQ-S661LS,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val VIMOQ_S661LS = "spec:width=720,height=1612,unit=px,dpi=320"

  }
