package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Technicolor device specifications for Android Compose previews.
 *
 * This extension provides Technicolor device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technicolor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technicolor: Any
  get() = object {
      /** Technicolor dci765ekt */
      val DCI765EKT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Technicolor dwt765lmt */
      val DWT765LMT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Technicolor dwt765ti */
      val DWT765TI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Technicolor uie4027lgu */
      val UIE4027LGU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Technicolor uiw4010ech */
      val UIW4010ECH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Technicolor uzw4010tim */
      val UZW4010TIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
