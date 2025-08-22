package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LGE device specifications for Android Compose previews.
 *
 * This extension provides LGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LGE: Any
  get() = object {
      /** LGE cayman */
      val CAYMAN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LGE tvg2a */
      val TVG2A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LGE woofer2 */
      val WOOFER2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
