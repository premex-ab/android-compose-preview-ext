package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Datamini-TWG10 device specifications for Android Compose previews.
 *
 * This extension provides Datamini-TWG10 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DataminiTWG10.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DataminiTWG10: Any
  get() = object {
      /** Datamini-TWG10 K508101 */
      val K508101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
