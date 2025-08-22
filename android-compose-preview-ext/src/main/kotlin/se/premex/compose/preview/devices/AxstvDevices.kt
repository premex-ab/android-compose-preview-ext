package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AXSTV device specifications for Android Compose previews.
 *
 * This extension provides AXSTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Axstv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Axstv: Any
  get() = object {
      /** AXSTV SEI130PTS */
      val SEI130PTS = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AXSTV SEI530PTS */
      val SEI530PTS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
