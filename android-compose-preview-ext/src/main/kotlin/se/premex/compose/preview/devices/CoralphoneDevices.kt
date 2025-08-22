package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CoralPhone device specifications for Android Compose previews.
 *
 * This extension provides CoralPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coralphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coralphone: Any
  get() = object {
      /** CoralPhone CoralNeural3 */
      val CORALNEURAL3 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
