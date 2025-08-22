package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNTAK device specifications for Android Compose previews.
 *
 * This extension provides SUNTAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNTAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNTAK: Any
  get() = object {
      /** SUNTAK MOJO */
      val MOJO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUNTAK MOX_2 */
      val MOX_2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
