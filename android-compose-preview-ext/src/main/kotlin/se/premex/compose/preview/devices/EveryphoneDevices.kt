package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EveryPhone device specifications for Android Compose previews.
 *
 * This extension provides EveryPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Everyphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Everyphone: Any
  get() = object {
      /** EveryPhone EP172BZ */
      val EP172BZ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EveryPhone EP172PR */
      val EP172PR = "spec:width=720,height=1280,unit=px,dpi=320"

  }
