package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ElisaElamus device specifications for Android Compose previews.
 *
 * This extension provides ElisaElamus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elisaelamus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elisaelamus: Any
  get() = object {
      /** ElisaElamus uzw4026ele */
      val UZW4026ELE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
