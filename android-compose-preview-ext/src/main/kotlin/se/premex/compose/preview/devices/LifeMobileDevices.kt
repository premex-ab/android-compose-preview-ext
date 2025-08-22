package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Life_mobile device specifications for Android Compose previews.
 *
 * This extension provides Life_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LifeMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LifeMobile: Any
  get() = object {
      /** Life_mobile LM1 */
      val LM1 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
