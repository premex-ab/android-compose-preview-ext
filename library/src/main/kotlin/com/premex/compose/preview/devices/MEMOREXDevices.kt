package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEMOREX device specifications for Android Compose previews.
 *
 * This extension provides MEMOREX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEMOREX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEMOREX: Any
  get() = object {
      /** MEMOREX MTAB_PRO_2600 */
      val MTAB_PRO_2600 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
