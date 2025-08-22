package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * UNNIONTECH device specifications for Android Compose previews.
 *
 * This extension provides UNNIONTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unniontech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unniontech: Any
  get() = object {
      /** UNNIONTECH UNSP7 */
      val UNSP7 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
