package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * jetfon device specifications for Android Compose previews.
 *
 * This extension provides jetfon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jetfon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jetfon: Any
  get() = object {
      /** jetfon MT1 */
      val MT1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
