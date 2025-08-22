package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAUS device specifications for Android Compose previews.
 *
 * This extension provides HAUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haus: Any
  get() = object {
      /** HAUS HAUS_JS410 */
      val HAUS_JS410 = "spec:width=480,height=854,unit=px,dpi=240"

      /** HAUS JS420 */
      val JS420 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
