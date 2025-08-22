package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AGNO device specifications for Android Compose previews.
 *
 * This extension provides AGNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AGNO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AGNO: Any
  get() = object {
      /** DeviceSpec(manufacturer=AGNO, code=TAIG717A, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGNO, code=TAIG717A, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val TAIG717A = "spec:width=800,height=1340,unit=px,dpi=213"

  }
