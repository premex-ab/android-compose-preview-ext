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
 * @Preview(device = Devices.PyurTv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PyurTv: Any
  get() = object {
      /** PYUR_TV m377genb_pyur */
      val M377GENB_PYUR = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
