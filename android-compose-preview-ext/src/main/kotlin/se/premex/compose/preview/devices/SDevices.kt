package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * S device specifications for Android Compose previews.
 *
 * This extension provides S device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.S.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.S: Any
  get() = object {
      /** S T8100 */
      val T8100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** S T8116 */
      val T8116 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** S T8133_EEA */
      val T8133_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
