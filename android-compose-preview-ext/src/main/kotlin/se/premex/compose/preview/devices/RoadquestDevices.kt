package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RoadQuest device specifications for Android Compose previews.
 *
 * This extension provides RoadQuest device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Roadquest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Roadquest: Any
  get() = object {
      /** RoadQuest RQ-G */
      val RQ_G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
