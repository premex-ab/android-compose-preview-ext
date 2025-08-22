package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ODYS device specifications for Android Compose previews.
 *
 * This extension provides ODYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Odys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Odys: Any
  get() = object {
      /** ODYS FALCON_10_PLUS_3G */
      val FALCON_10_PLUS_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS GOAL_10_PLUS_3G */
      val GOAL_10_PLUS_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS JUNIOR_8_PRO */
      val JUNIOR_8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS Maven_T10_pro */
      val MAVEN_T10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS NoteTab_Pro */
      val NOTETAB_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS PACE10 */
      val PACE10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS T1011S */
      val T1011S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ODYS T1021 */
      val T1021 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ODYS THANOS_10 */
      val THANOS_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ODYS Titan_10_LTE */
      val TITAN_10_LTE = "spec:width=800,height=1280,unit=px,dpi=160"

  }
