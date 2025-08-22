package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nubia device specifications for Android Compose previews.
 *
 * This extension provides nubia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nubia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nubia: Any
  get() = object {
      /** nubia K68 */
      val K68 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** nubia K99J */
      val K99J = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** nubia nubia_NB1001-UN */
      val NUBIA_NB1001_UN = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** nubia NX503A */
      val NX503A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX505J */
      val NX505J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX507J */
      val NX507J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX508J */
      val NX508J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX510J */
      val NX510J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX511J */
      val NX511J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX512J */
      val NX512J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX513J */
      val NX513J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX523J_V1 */
      val NX523J_V1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX529J */
      val NX529J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX531J */
      val NX531J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX541J */
      val NX541J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX549J */
      val NX549J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX551J */
      val NX551J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX563J */
      val NX563J = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** nubia NX569J */
      val NX569J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX573J */
      val NX573J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX575J */
      val NX575J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX589J */
      val NX589J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX591J */
      val NX591J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX595J */
      val NX595J = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** nubia NX601J */
      val NX601J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX609J */
      val NX609J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** nubia NX612J */
      val NX612J = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** nubia NX619J */
      val NX619J = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** nubia NX619J-EEA */
      val NX619J_EEA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** nubia NX627J */
      val NX627J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX627J-EEA */
      val NX627J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX629J */
      val NX629J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX629J-EEA */
      val NX629J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX651J */
      val NX651J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX651J-EEA */
      val NX651J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX659J */
      val NX659J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX659J-EEA */
      val NX659J_EEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX659J-RU */
      val NX659J_RU = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX659J-UN */
      val NX659J_UN = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** nubia NX666J */
      val NX666J = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX669J */
      val NX669J = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX669J-EEA */
      val NX669J_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX669J-UN */
      val NX669J_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX679J */
      val NX679J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX679J-EEA */
      val NX679J_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX679J-UN */
      val NX679J_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX679S */
      val NX679S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX709J */
      val NX709J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX709J-EEA */
      val NX709J_EEA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX709J-UN */
      val NX709J_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX709S */
      val NX709S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX709S-EEA */
      val NX709S_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX709S-UN */
      val NX709S_UN = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia NX729J */
      val NX729J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia NX729J-EEA */
      val NX729J_EEA = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia NX729J-UN */
      val NX729J_UN = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia NX769J */
      val NX769J = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia NX789J */
      val NX789J = "spec:width=1216,height=2688,unit=px,dpi=520"

      /** nubia NX907J */
      val NX907J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nubia P606F10 */
      val P606F10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** nubia P606F17 */
      val P606F17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia P606F18 */
      val P606F18 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia P606F19 */
      val P606F19 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** nubia P606F20 */
      val P606F20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia P616F02 */
      val P616F02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia P616F03 */
      val P616F03 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** nubia P616F05 */
      val P616F05 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia P678F01 */
      val P678F01 = "spec:width=1188,height=2790,unit=px,dpi=520"

      /** nubia P720F08 */
      val P720F08 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia P720F09 */
      val P720F09 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** nubia P720F09_U */
      val P720F09_U = "spec:width=720,height=1612,unit=px,dpi=320"

      /** nubia P720F10 */
      val P720F10 = "spec:width=900,height=2030,unit=px,dpi=400"

      /** nubia P720F11 */
      val P720F11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia P720F12 */
      val P720F12 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** nubia P745F01 */
      val P745F01 = "spec:width=1188,height=2790,unit=px,dpi=520"

      /** nubia P780F01 */
      val P780F01 = "spec:width=900,height=2030,unit=px,dpi=400"

      /** nubia P780F02 */
      val P780F02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia P820F03 */
      val P820F03 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia P820F05 */
      val P820F05 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** nubia P875N02 */
      val P875N02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia P898A21 */
      val P898A21 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia P898P02 */
      val P898P02 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** nubia P963F11 */
      val P963F11 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** nubia PQ82A01 */
      val PQ82A01 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia PQ82A02 */
      val PQ82A02 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** nubia PQ82A04 */
      val PQ82A04 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** nubia PQ82A11 */
      val PQ82A11 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia PQ83A01 */
      val PQ83A01 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia PQ83A06 */
      val PQ83A06 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia PQ83F01 */
      val PQ83F01 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** nubia PQ83P01 */
      val PQ83P01 = "spec:width=1800,height=2880,unit=px,dpi=400"

      /** nubia PQ84A01 */
      val PQ84A01 = "spec:width=1216,height=2688,unit=px,dpi=520"

      /** nubia PQ84A02 */
      val PQ84A02 = "spec:width=1216,height=2688,unit=px,dpi=520"

      /** nubia Z6255 */
      val Z6255 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia Z6657 */
      val Z6657 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** nubia Z6701S */
      val Z6701S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** nubia Z8900S */
      val Z8900S = "spec:width=1188,height=2790,unit=px,dpi=520"

  }
