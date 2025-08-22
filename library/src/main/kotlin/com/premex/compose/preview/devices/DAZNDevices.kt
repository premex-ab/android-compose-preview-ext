package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAZN device specifications for Android Compose previews.
 *
 * This extension provides DAZN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAZN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAZN: Any
  get() = object {
      /** DAZN m393gena_dazn */
      val M393GENA_DAZN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
