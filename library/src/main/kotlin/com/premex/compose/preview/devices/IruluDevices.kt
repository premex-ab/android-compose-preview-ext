package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iRULU device specifications for Android Compose previews.
 *
 * This extension provides iRULU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Irulu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Irulu: Any
  get() = object {
      /** iRULU iRULU-X11 */
      val IRULU_X11 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
