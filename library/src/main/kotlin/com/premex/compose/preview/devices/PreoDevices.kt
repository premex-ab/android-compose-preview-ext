package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * preo device specifications for Android Compose previews.
 *
 * This extension provides preo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Preo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Preo: Any
  get() = object {
      /** preo PTAB_P8 */
      val PTAB_P8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
