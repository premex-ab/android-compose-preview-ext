package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SAMTECH device specifications for Android Compose previews.
 *
 * This extension provides SAMTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samtech: Any
  get() = object {
      /** SAMTECH TWIFI-06 */
      val TWIFI_06 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
