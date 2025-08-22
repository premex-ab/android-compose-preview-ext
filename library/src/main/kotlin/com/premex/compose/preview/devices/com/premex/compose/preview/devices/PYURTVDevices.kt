package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PYUR_TV device specifications for Android Compose previews.
 *
 * This extension provides PYUR_TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PYURTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PYURTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=PYUR_TV, code=m377genb_pyur, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PYUR_TV, code=m377genb_pyur,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M377GENB_PYUR = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
