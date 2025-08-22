package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LGUplus device specifications for Android Compose previews.
 *
 * This extension provides LGUplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LGUplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LGUplus: Any
  get() = object {
      /** LGUplus uie4057lgu */
      val UIE4057LGU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LGUplus ute7057lgu */
      val UTE7057LGU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
