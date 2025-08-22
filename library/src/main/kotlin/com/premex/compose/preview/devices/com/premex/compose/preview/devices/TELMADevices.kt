package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELMA device specifications for Android Compose previews.
 *
 * This extension provides TELMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TELMA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TELMA: Any
  get() = object {
      /** DeviceSpec(manufacturer=TELMA, code=EGO_plus, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELMA, code=EGO_plus, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val EGO_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TELMA, code=TELMA_IFEEL_MAX, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TELMA, code=TELMA_IFEEL_MAX,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TELMA_IFEEL_MAX = "spec:width=480,height=854,unit=px,dpi=240"

  }
